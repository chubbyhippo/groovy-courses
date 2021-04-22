import classes.Developer

Developer developer = new Developer(first: "Hello", last: "Groovy")
developer.last = "Test"
developer.languages << "Groovy"
developer.languages << "Java"
developer.work()