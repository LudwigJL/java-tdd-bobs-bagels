

| Classes  | Method                                                            | Member Variables      | Scenario                                                                                   | Output                         |
|----------|-------------------------------------------------------------------|-----------------------|--------------------------------------------------------------------------------------------|--------------------------------|
| `Basket` | `addBagel(String bagelType)`                                      | `List<String> bagels` | If bagels.length; < basketLimit, add the bagel to the list. Else: return "basket is full". | "successfully added" /         |
|          |                                                                   | `int basketLimit`     | Else: let user know it is full.                                                            | "Basket is full";              |
|          |                                                                   |                       |                                                                                            |                                |
|          | `removeBagel(String bagelType)`                                   |                       | If bagelType in bagels, remove it from the basket and notify user.                         | "bagelType removed"            |
|          |                                                                   |                       | Else: no bagelType found in bagel, notify user.                                            | "bagelType not in your basket" |
|          |                                                                   |                       |                                                                                            |                                |
|          | `changeBasketCapacity(int newBasketCapacity, int basketCapacity)` | `int numberOfBaskets` | Replace the new with the old basket capacity.                                              | Changed: int basketCapacity.   |





