/* Default constructor
  Parametrize constructor
  Named constructor
  */

main() {
//Constructor excute first, when made object of class

  //default
  var obj = new class1();
  class1();
  //parameterize constructor
  var obj1 = new class2("Hifza");
  obj1.fun();

  //Named constructor

  class3.mycosnt();
}

class class1 {
  //default constructor
  class1() {
    print("Default Constructor");
  }
}

class class2 {
  var _name = "kanwal";
  //parameterize constructor
  class2(name) {
    //class2(this.name);
    print("para const " +
        name); //this.name for remove conflict of same variable name
    _name = name;
  }

  fun() {
    print(_name);
  }
}

//Named constructor
class class3 {
  class3.mycosnt() {
    print("name const");
  }
}
