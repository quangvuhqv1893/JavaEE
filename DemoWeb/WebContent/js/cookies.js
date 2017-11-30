
/*SET COOKIES*/
function setCookies() {

	if (window.document.cookies.checkboxx.checked) {
		var d = new Date();
		d.setFullYear(d.getFullYear()+1);

		var who = window.document.cookies.username.value;
		document.cookie="username="+who+";"+"expies=" + d.toGMTString();
		alert(document.cookie);
		
	}else{
		deleteCookie();
	}
	return true;
}


/*READ COOKIES*/
function readCookie() {
if (document.cookie) {
var theCookie = document.cookie;
var pos = theCookie.indexOf("username=");
if (pos != -1) {
var cookie_array = theCookie.split("=");
var value = cookie_array[1];
// Load the stored username into the form
window.document.cookieForm.username.value=value;
window.document.cookieForm.persist.checked=true;
}
}
}
/*DELETE COOKIES*/
function deleteCookie() {
if (document.cookie) {
// Get a date and set it to last year
var expDate = new Date();
expDate.setFullYear(expDate.getFullYear() - 1);
document.cookie = "username=" + "" + ";" + "expires=" + expDate.toGMTString();
}
}