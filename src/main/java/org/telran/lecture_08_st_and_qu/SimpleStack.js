let stack = [];

stack.push(1);

let top = stack.pop();
console.log(top);

top = stack.pop();
if (top === undefined){
    console.log("стек пустой");
}else{
    console.log(top);
}
