void main() {
//control structure
  /*if structure
   if-else structure
   if elseif-else structure
   switch case*/

  //if
  var name = 'hifza';

  if (name == 'hifza') {
    print("Your name is Hifza");
  }

  //if else

  if (name == 'Saman') {
    print("Your name is Hifza");
  } else {
    print("Your name is Kanwal");
  }

  // if elseif-else structure

  if (name == 'Saman') {
    print("Your name is Saman");
  } else if (name == 'hifza') {
    print("Your name is hifza");
  } else {
    print("Your name is Kanwal");
  }

  //switch

  switch (name) {
    case 'hifza':
      print("Hifza");
      break;

    case 'saman':
      print("Saman");
      break;

    default:
      print("kanwal");
  }
}
