Project: The E-Commerce Order System

Goal: Build a backend to process customer orders, handle payments, and track delivery status.

1. The Patterns You Must Use
State Pattern: The Order must transition strictly through these states: New → Paid → Shipped → Delivered.

Constraint: You cannot pay for a "Shipped" order. You cannot ship a "New" (unpaid) order. The logic must reside in State classes, not a giant if-else block.

Strategy Pattern: Handle payment processing.

Constraint: Support CreditCard and PayPal. The order object shouldn't care how the payment is processed, just that it is.

Decorator Pattern: Calculate the total cost.

Constraint: Start with a base Order cost. dynamically add "Gift Wrapping" or "Express Shipping" to increase the cost without modifying the Order class.

Observer Pattern: When the Order State changes (e.g., to "Shipped"), automatically notify the Customer via "Email".

2. The Rules (SOLID)
Single Responsibility: Your Order class should not contain the logic for sending emails or processing credit cards.

Open/Closed: I should be able to add a "Crypto" payment method or a "Holiday Discount" decorator without touching existing code.

3. Your First Task
Start by setting up the State Pattern and the Order class. Ignore the other patterns for now.

Goal: Create a console app where I can create an order, pay for it, and ship it. If I try to ship an unpaid order, it should print an error.