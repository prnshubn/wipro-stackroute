/* the themes object declared below contains theme properties with 
 backgroundColor and color values

 the theme property names are matched with ids of UI input elements of type 'radio' 
 available on the index.html page

 based on the radio button selected the theme property should be selected 
 and its values should be used to style the document
*/

const themes = {
    "bright": {
        "backgroundColor": "lightyellow",
        "color": "darkgreen"
    },
    "cool": {
        "backgroundColor": "lightgray",
        "color": "indigo"
    },
    "fiery": {
        "backgroundColor": "chocolate",
        "color": "lightgoldenyellow"
    }
}

function changeTheme(event) {

 


  const r=event.srcElement.id;
   
   if(r=='cool') {
       
        
    document.body.style.backgroundColor=themes.cool.backgroundColor;
       document.body.style.color=themes.cool.color;
    }
    else if(r=='bright') {
        document.body.style.color=themes.bright.color;
        document.body.style.backgroundColor=themes.bright.backgroundColor;
        
    }
    else if(r=='fiery') {
        document.body.style.color=themes.fiery.color;
        document.body.style.backgroundColor=themes.fiery.backgroundColor;
        
    }
}

module.exports = changeTheme
