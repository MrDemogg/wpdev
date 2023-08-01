ServerEvents.recipes(event => {
  // добавление крафта ItemId
  event.recipes.create.milling([Item.of('immersiveengineering:dust_steel').withChance(0.003),Item.of('mekanism:dust_iron').withChance(0.97)], 'minecraft:iron_ingot')
})