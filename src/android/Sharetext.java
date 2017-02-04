package io.github.cedced19.sharetext;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import android.content.Intent;

    /**
     * This class echoes a string called from JavaScript.
     */
    public class Sharetext extends CordovaPlugin {

        @Override
        public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
            if (action.equals("sharetext")) {
                String message = args.getString(0);
                String title = args.getString(1);
                this.share(message, title, callbackContext);
                return true;
            }
            return false;
        }

        private void share(String message, String title, CallbackContext callbackContext) {
          try {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
            sendIntent.putExtra(Intent.EXTRA_TEXT, message);
            sendIntent.setType("text/plain");
            sendIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            cordova.getActivity().startActivity(Intent.createChooser(sendIntent, title));
            callbackContext.success();
            } catch(Error e) {
                callbackContext.error(e.getMessage());
            }

        }
    }
