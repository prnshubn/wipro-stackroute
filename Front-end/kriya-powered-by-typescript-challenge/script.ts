var aload = (a) => {
	var pa = document.createElement("p");
	pa.textContent = "";
	pa.classList.add("par");
	if (a == "Zoarere") {
		document.getElementById("id1").appendChild(pa);
	}
	if (a == "Telepark") {
		document.getElementById("id2").appendChild(pa);
	}
	if (a == "Talkola") {
		document.getElementById("id3").appendChild(pa);
	}
	if (a == "Buzzworks") {
		document.getElementById("id4").appendChild(pa);
	}
	if (a == "Omatom") {
		document.getElementById("id5").appendChild(pa);
	}
	if (a == "Optique") {
		document.getElementById("id6").appendChild(pa);
	}
	console.log("zoo");
};
aload("Buzzworks");
