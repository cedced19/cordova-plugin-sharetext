module.exports = function(message,title,success,error){
  if(typeof message !== "string") {
    text = "";
  }
  if(typeof title !== "string") {
    title = "Share";
  }
  cordova.exec(console.log,console.log,"Sharetext","sharetext",[message,title]);
  return true;
};
