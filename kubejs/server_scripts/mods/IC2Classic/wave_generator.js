ServerEvents.recipes(event => {
  // удаление крафта всех кравтов ItemId
  event.remove({output: 'ic2:wave_generator'})
  
  // добавление крафта ItemId
  event.recipes.create.pressing('ic2:wave_generator', 'ic2:ocean_generator')
})