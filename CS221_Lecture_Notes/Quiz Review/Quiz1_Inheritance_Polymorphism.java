/**
 * A child class is...
Typically has more functionality or is more specific
than its parent

What is not a purpose of inheritance?
To spread code across as many classes as possible

What does a child inherit from its parents?
Everything except a constructor

What keyword can a child use to refer to its parent?
super

What visibility modifier does a parent class use to
apply instance variables or methods so the child
class can access?
protected

What is an invalid assignment?
    class BlueThing ...
    interface Singer ...
    class Smurf extends BlueThing implements Singer ...

Smurf f = new BlueThing
Smurf is-a BlueThing and Singer, but not all BlueThings
are Smurfs; cannot have child create parent

What is the output of giz.report()
    public class Monitor {
        public void report () {
            "nothing to report"
        }
    }
    public class Widget extends Monitor {
        public void report () {
            "Beware of spinning"
        }
    }
    public class Gizmo extends Widget {
    }

    Gizmo giz = new Gizmo();

Beware of spinning; Gizmo inherited the Widget
report message

What is the output of:
    Monitor m = wid; m.report();
    Widget wid = new Widget();

Monitor is allowed to be a widget and it calls,
but a widget cannot go other direction

Similar to: Mammal m = new Dog();
    All dogs are mammals but not all mammals are dogs
 */

