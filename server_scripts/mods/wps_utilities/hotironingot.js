ServerEvents.recipes(event => {
    event.remove({output: 'wps_utilities:hotironingot'})
    event.recipes.immersiveengineeringAlloy('2x wps_utilities:hotironingot', 'minecraft:iron_ingot', 'minecraft:iron_ingot')
})