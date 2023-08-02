ServerEvents.recipes(event => {
  // удаление крафта зельеварки
  event.remove({output: 'minecraft:brewing_stand'})
  // добавление крафта зельеварки
    event.shaped('minecraft:brewing_stand', [
    ' C ',
    'ACA',
    'BBB'
  ], {
     A: 'createdeco:cast_iron_ingot'
    ,B: 'minecraft:smooth_stone_slab'
    ,C: 'minecraft:blaze_rod'
  }) 
})
