# Define the list
i = [10, 30, 40, 50, "Hello"]

# Print specific elements and slices
print(i[3], i[4])        # Prints the element at index 3 and index 4
print(i[0:2])            # Prints elements from index 0 to 1 (excluding index 2)
print(i[0::2])           # Prints elements from index 0 to the end with a step of 2
print(i[3:])             # Prints elements from index 3 to the end
print(i[-1::-2])         # Prints elements from the last to the first with a step of -2
print(i[-1::-1])         # Prints elements from the last to the first with a step of -1 (reverses the list)
