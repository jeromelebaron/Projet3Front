$(document).ready(function(){

	var srcIn='images/staron.gif'; //image au survol
	var srcOut='images/staroff.gif'; // image non survolée
	var srcDemi='images/stardemi.gif'; // image non survolée
	var inputHidden;
	var moyenneRecup;
	
	
//	if (document.getElementById('monForm:note') != null) {
//		inputHidden = document.getElementById('monForm:note');
//		if (inputHidden != null) {
//			chargerEtoile(inputHidden.value);
//		}
//	}
	if (document.getElementById('monForm:moyenne') != null) {
		moyenneRecup = document.getElementById('monForm:moyenne');
		if (moyenneRecup != null) {
			chargerMoyenne(moyenneRecup.value);
		}
	}

	// Obtenir id numérique des étoiles au format star_numero
	function idNum(id)
	{
		var id=id.split('_');
		var id=id[1];
		return id;
	}

	// Survol des étoiles
	$('.star').hover(function(){
		var id=idNum($(this).attr('id')); // id numérique de l'étoile survolée
		var nbStars=$('.star').length; // Nombre d'étoiles de la classe .star

		var i; // Variable d'incrémentation
		for (i=1;i<=nbStars;i++)
		{
			if(i<=id) $('#star_'+i).attr({src:srcIn});	
			else if(i>id) $('#star_'+i).attr({src:srcOut});
			if(i==id) inputHidden.value = i; // affectation de la note au formulaire
		}
	});

	function chargerEtoile(nombreEtoile){
		for (var i=1;i<=nombreEtoile;i++)
		{
			$('#starNonNull_'+i).attr({src:srcIn});	
		}
	}

	function chargerMoyenne(nombreEtoile){
		var demi = 0;
		for (var i=1;i<=nombreEtoile;i++)
		{
			$('#starMoyenne_'+i).attr({src:srcIn});	
			demi = nombreEtoile-i;
		}
		if (demi >= 0.75){
			$('#starMoyenne_'+i).attr({src:srcIn});	
		}
		else if (demi >= 0.25){
			$('#starMoyenne_'+i).attr({src:srcDemi});	
		}
	}

	
	var test = document.getElementsByClassName("test_toto_titi");
	for(var i = 0 ; i < test.length ; i++) {
		notes = test[i].getElementsByTagName("input");
		var note = 0; 
		for(var j = 0 ; j < notes.length; j++) {
			if(notes[j].type=="hidden") {
				note = notes[j].value;
			}
		}
		images = test[i].getElementsByTagName("img"); 
		for(var j = 0 ; j < images.length; j++) {
			var image = images[j];
			if(j < note) {
				$(image).attr({src:srcIn});	
			}
		}
		console.log(note);
	}
	
});