$(document).ready(function () {
	console.log('Configuring Dragula for containers w/ d.gebt');
	var drake = dragula(
		[
			document.getElementById('options'),
			document.getElementById('catA'),
			document.getElementById('catB'),
			document.getElementById('catC'),
			document.getElementById('catD'),
		]
	);

	drake.on('drop', function(el, target, source, sibling){
		console.log("Dropped:", el);
		var optionsLeft = $('#options .option').length;
		console.log('Options left:', optionsLeft);
		var catAChildren = $("#catA").children();
		console.log('Children of catA:', catAChildren);

		var allCorrect = true;
		if(optionsLeft > 0) {
			$("#catC").children().each(function(i, e){
			if(!$(e).hasClass('catC')){
				allCorrect = false;
			}
			})
			$("#catA").children().each(function(i, e){
			if(!$(e).hasClass('catA')){
				allCorrect = false;
			}
			})
			$("#catB").children().each(function(i, e){
			if(!$(e).hasClass('catB')){
				allCorrect = false;
			}
			})
			$("#catD").children().each(function(i, e){
			if(!$(e).hasClass('catD')){
				allCorrect = false;
			}
			})
			console.log("allCorrect", allCorrect);
		}
		/*
		for(i = 0; i < quad1Children.length; i++) {
			console.log('loop');
			if(quad1Children[i].attrib('id') == 'catC') {
				console.log('correct!');
			}
		}
		*/
	})
	$('checkButton').click(function() {
		if(allCorrect === true) {
			console.log("YOU DID IT!");
		}
	});
});