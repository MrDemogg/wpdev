ServerEvents.recipes(event => {
    event.remove({output: 'create:steam_engine'})
    event.recipes.create.sequenced_assembly(
        [
            Item.of('create:steam_engine').withChance(100)
        ],
        'wps_utilities:steamenginebase',
        [
            event.recipes.create.deploying(
                "wps_utilities:steamenginebase",
                [
                    'wps_utilities:steamenginebase',
                    'wps_utilities:steamenginepiston'
                ])//.keepHeldItem()
        ])
        .transitionalItem('wps_utilities:steamenginebase')
        .loops(1)
})