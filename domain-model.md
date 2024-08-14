

| Classes  | Method                                                            | Member Variables      | Scenario                                                                     | Output     |
|----------|-------------------------------------------------------------------|-----------------------|------------------------------------------------------------------------------|------------|
| `Basket` | `addBagel(String bagelType)`                                      | `List<String> bagels` | If bagels.length; < basketLimit, add the bagel to the list.                  | true       |
|          |                                                                   | `int basketLimit`     | Else: let user know it is full.                                              | false      |
|          |                                                                   |                       |                                                                              |            |
|          | `removeBagel(String bagelType)`                                   |                       | If bagelType in bagels, remove it from the basket and notify user with true. | true       |
|          |                                                                   |                       | Else: no bagelType found in bagel, notify user with false.                   | false      |
|          |                                                                   |                       |                                                                              |            |
|          | `changeBasketCapacity(int newBasketCapacity, int basketCapacity)` | `int numberOfBaskets` | Replace the new with the old basket capacity. success equals true            | true/false |





