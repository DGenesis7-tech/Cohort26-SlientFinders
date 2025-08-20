function douubles(String){
let newString = "";
for (let count = 0; count < String.length; count++){
newString += String[count];
newString += String[count];
}
return newString;
}

console.log(douubles("Hello World"));