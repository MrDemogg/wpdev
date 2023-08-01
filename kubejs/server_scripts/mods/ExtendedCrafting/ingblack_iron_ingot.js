ServerEvents.recipes(event => {
  // удаление крафта всех кравтов ItemId
  event.remove({output: 'extendedcrafting:black_iron_ingot'})
  
  // добавление крафта ItemId
    event.shaped('extendedcrafting:black_iron_ingot', [
    'CDC',
    'BEB',
    'ADA'
  ], {
    A: 'immersiveengineering:ingot_lead'
   ,B: 'immersiveengineering:ingot_steel'
   ,C: 'createdeco:cast_iron_ingot'
	,D: 'minecraft:obsidian'
	,E: 'ic2:ingot_refined_iron'
//	 ,F: ItemF
//	 ,G: ItemG
//	 ,H: ItemH
//	 ,I: ItemI
  })
})