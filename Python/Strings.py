print('basics again')

a = 'Lesnar'
b = 55
# format string
print('My name is {name} and my ID is mentioned as = {ID}'.format(
    name=a, ID=b))

# f string
print(f'My name is {a} and my ID is {b}')

# String functions below
s = 'hello world'

# Capitalize string
print(s.capitalize())

# Make all uppercase
print(s.upper())

# Make all lower
print(s.lower())

# Swap case
print(s.swapcase())

# Get length
print(len(s))

# Replace
print(s.replace('world', 'everyone'))

# Count
sub = 'h'  # count number of h's
print(s.count(sub))

# Starts with (returns boolean)
print(s.startswith('hello'))

# Ends with (returns boolean)
print(s.endswith('d'))

# Split into a list of words
print(s.split())

# Find position (return index 0-based)
print(s.find('r'))

# Is all alphanumeric
print(s.isalnum())

# Is all alphabetic
print(s.isalpha())

# Is all numeric
print(s.isnumeric())
