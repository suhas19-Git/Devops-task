# sum_calculator.py

def add_numbers(a, b):
    return a + b

def main():
    print("Hello! Naan sum calculator")
    num1 = float(input("Ondu number enter madu: "))
    num2 = float(input("Inno number enter madu: "))
    
    result = add_numbers(num1, num2)
    print(f"Sum = {result}")

if __name__ == "__main__":
    main()
