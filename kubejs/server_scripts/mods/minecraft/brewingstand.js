ServerEvents.recipes(event => {
  // �������� ������ ����������
  event.remove({output: 'minecraft:brewing_stand'})
  // ���������� ������ ����������
    event.shaped('minecraft:brewing_stand', [
    ' C ',
    'ACA',
    'BBB'
  ], {
     A: '#forge:ingots/cast_iron'
    ,B: 'minecraft:smooth_stone_slab'
    ,C: 'minecraft:blaze_rod'
  }) 
})
