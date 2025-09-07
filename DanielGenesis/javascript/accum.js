function accum(name) {
let accum = "";
let count = 1;
for (let index in name) { 
accum += name[index].repeat(count)
if (index < (name.length - 1)) accum += "-" ;
count ++
}
return accum;
}

console.log(accum("Daniel"));