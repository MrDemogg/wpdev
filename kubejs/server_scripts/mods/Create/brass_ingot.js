ServerEvents.recipes(event => {
  // удаление крафта всех кравтов ItemId
  event.remove({output: 'create:brass_ingot'})
  
  // добавление крафта ItemId
  event.recipes.create.mixing(Item.of('create:brass_ingot', 3).withChance(0.5),['2x minecraft:copper_ingot','create:zinc_ingot']).heated()
})

//'create:brass_ingot'