from typing import TypeVar

T = TypeVar('T')
U = TypeVar('U')

def combine(a: T, b: U) -> str:
    return str(a) + str(b)

print(combine(10, 20)) 
print(combine('hello', 2020)) 