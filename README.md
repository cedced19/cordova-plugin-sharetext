# cordova-plugin-sharetext

A Android Cordova Plugin to open a native "share" popup to share text to social networks apps. Forked from [Mark Marijnissen's plugin](https://github.com/markmarijnissen/cordova-plugin-share).

### Install

In your phonegap/cordova project, type:

`cordova plugins add https://github.com/cedced19/cordova-plugin-sharetext.git --save`

### Usage

`navigator.share(text,title)`

1. text: Text to share, i.e. "Incredible plugin"
2. title: Title of popup, i.e. "Share this quote" (android only, default: "Share")

### Created thanks to the code from

* Android Developer: [documentation](http://developer.android.com/training/sharing/send.html)
* Eddy Verbruggen: [Social Share plugin](https://github.com/EddyVerbruggen/SocialSharing-PhoneGap-Plugin)
* Mark Marijnissen: [Share plugin](https://github.com/markmarijnissen/cordova-plugin-share)

### License

MIT license
