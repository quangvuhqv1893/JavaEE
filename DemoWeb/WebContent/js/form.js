/*hien thi anh khi chon anh trong form*/
function previeImage() {
	var oFReader = new FileReader();
	oFReader.readAsDataURL(document.getElementById("choseFlie").files[0]);

	oFReader.onload = function(oFREvent) {
		document.getElementById("upImg").src = oFREvent.target.result;
	};
}

// function checkValidate() {
// 	for (var i = 0; i < document.form[0].elements.length; i++) {
// 		var value =  document.form[0].elements[i].value;
// 		if (value=="") {
// 			alert("please enter all input!!!");
// 			return false;
// 		}

// 	}
// 	return true;

// }

/*check input phone number*/
function checkPhone() {
	var phNum = document.form.area.value+document.form.pre.value+document.form.last.value;
	for (i = 0; i < phNum.length; i++) {
		if (phNum.charAt(i)<"0"||phNum.charAt(i)>"9") {
			alert("please enter number!");
			return false;
		}
	}
	if (phNum.length<10) {
		alert("please enter 10 digit for phone number!");
		return false;
	}
	return true;
}