// A covariant return type allows a method in a child class to override a method in the parent class 
// and change the return type to a subclass type (instead of exactly the same type).

class Animal{
    Animal getAnimal(){
        return new Animal();
    }

}

class Dog extends Animal {
    @Override
    Dog getAnimal(){ //Subclass Return Type
        return new Dog();
    }
}