ServerEvents.recipes(event => {
  // удаление крафта всех кравтов ItemId
  event.remove({output: 'immersiveengineering:sheetmetal_steel'})
  
  // добавление крафта ItemId
    event.shaped('immersiveengineering:sheetmetal_steel', [
    'AAA',
    'AAA',
    'AAA'
  ], {
    A: 'immersiveengineering:plate_steel'
//   ,B: ItemB
//   ,C: ItemC
//   ,D: ItemD
//   ,E: ItemE
//   ,F: ItemF
//   ,G: ItemG
//   ,H: ItemH
//   ,I: ItemI
  })
})
