ServerEvents.recipes(event => {
    event.remove({output: 'ic2:cf_pack'})
    event.remove({output: 'ic2:fuel_jetpack'})
    event.remove({output: 'ic2:compact_fuel_jetpack'})
    event.remove({output: 'ic2:electric_jetpack'})
    event.remove({output: 'ic2:compacted_electic_jetpack'})
    event.remove({output: 'ic2:nuclear_jetpack'})
    event.remove({output: 'ic2:compacted_nuclear_jetpack'})
})