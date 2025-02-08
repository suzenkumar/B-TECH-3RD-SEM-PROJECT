#format()
# Using format() to insert values into the string
w = "welcome {} to {} World".format("hello", 20)
print(w)  # Output: "welcome hello to 20 World"

# Using format() with indexed placeholders
w = "Welcome {1} to {0} World".format("hello", 20)
print(w)  # Output: "Welcome 20 to hello World"

# Using format() with named placeholders and formatting options
w = "welcome {b:>10} to {a:^10} World".format(a=30, b=40)
print(w)  # Output: "welcome         40 to    30     World"