# chain_of_responsibility

# Waste Management System

## Background
Municipalities and cities face significant challenges in managing and efficiently disposing of waste. Traditional waste collection methods often result in delays, inefficiencies, and high operational costs. An innovative solution is needed to automate the waste management process, ensuring timely collection and disposal while optimizing resource utilization.

## Objective
Develop an automated waste management system that uses a **Chain of Responsibility** pattern to ensure efficient waste collection and disposal. The system should handle different types of waste containers and trigger appropriate disposal actions based on the type and capacity of each container.

## Requirements

### Waste Container
- Implement a class to represent waste containers.
- Each container should have a specific **capacity** and **type** of waste (e.g., organic, recyclable, hazardous).

### Waste Collection Chain
- Use the **Chain of Responsibility** pattern to handle different types of waste containers.
- Each handler in the chain should be responsible for collecting and disposing of a specific type of waste.

### Waste Collection Process
1. The system initializes a chain of waste collectors, each responsible for a different type of waste.
2. When a waste container is full or needs disposal, the system triggers the waste collection process.
3. The appropriate waste collector in the chain handles the disposal based on the type and capacity of the waste container.

### Validation
- Ensure that waste containers are correctly identified and disposed of by the appropriate waste collector in the chain.


# UML CLASS DIAGRAM
![UML Class Diagram (4)](https://github.com/user-attachments/assets/3977a364-ae6f-4280-845d-2a0e70ded64b)
