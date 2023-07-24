StartupEvents.registry('item', event => {
    event.create('incomplete_silencer', 'sword')
        .texture('wpd:item/glush')
        .parentModel('wpd:item/glushitel')
        .displayName('Незаконченный глушитель')  
        .maxDamage(-1)
        .attackDamageBaseline(0)
        .attackDamageBonus(0)
})