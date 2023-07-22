ServerEvents.recipes(event => {
  // удаление крафта всех кравтов ItemId
  event.remove({output: 'immersiveengineering:sheetmetal_iron'})
  
  // добавление крафта ItemId
    event.shaped('immersiveengineering:sheetmetal_iron', [
    'AAA',
    'AAA',
    'AAA'
  ], {
    A: 'create:iron_sheet'
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