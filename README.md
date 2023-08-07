# Car_Rental

InitialCarRental.kt was refactored as motivated below:

1) The Customer class was violating the single responsibility principle so I removed BillingStatement functionality to a separate object with the sole purpose of creating statement.
2) The BillingStatement logic also contained the logic for calculating the FrequentPoints and the Rates which again violated the Single Responsibility principle so I moved this logic to newly created RateCalculator and FrequentPointsCalculator. Since this functionality was also tightly coupled to the BillingStatement this change also decoupled them and made them reusable.
3) The when statement in the BillingStatement logic was violating the open closed principle since for each new vehicle type introduced the logic to calculate both the frequentRenterPoints and the total rate would also need to change "Classes should be open to extension and closed to modification". To solve this I introduced the RentalCar interface which each type of vehicle can extend and define it's own rate while also adhering to the liskov substitution principle.

In short these changes where made to decouple the different functionalities of the application, isolate the impact of future changes and promote reusability.
   
