// Write code to return flat object from nested object

let employee = {
    name: "Dilip",
    address: {
      office:{
        city: "Bangalore",
        state: "Karnataka"
      },
      home:{
        city: "Ramgarh",
        state: "Jharkhand"
      }
    },
    age: 27
  }
  let finalObject={};
  function magic(obj, parent){
    for(let key in obj){
      if(typeof(obj[key]) === 'object'){
        magic(obj[key], parent + "-" + key);
      }
      else{
        finalObject[parent + "-" + key] = obj[key];
      }
    }
  }
  magic(employee, "employee");
  console.log(finalObject);
