module.exports = function(message,title,success,error){
  if(typeof message !== "string") {
    text = "";
  }
  if(typeof title !== "string") {
    title = "Share";
  }
  cordova.exec(success,error,"Sharetext","sharetext",[message,title,mimetype]);
  return true;
};
