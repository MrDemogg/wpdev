ServerEvents.recipes(event => {
    // �������� ������ ���� ������� ItemId
    event.remove({output: 'ic2:slag_generator'})

    // ���������� ������ ItemId
    let inter = 'ic2:advanced_machine_block'
    event.recipes.create.sequenced_assembly(
        'ic2:slag_generator'
    , 'ic2:advanced_machine_block', [
         event.recipes.create.deploying(inter, [inter, 'ic2:generator']) //������ ����
        ,event.recipes.create.pressing(inter, inter) // ������ ������
        ,event.recipes.create.deploying(inter, [inter, 'ic2:recycler']) //������ ����
        ,event.recipes.create.pressing(inter, inter) // ������ ������
        ,event.recipes.create.deploying(inter, [inter, 'ic2:plate_advanced_alloy']) //������ ����
        ,event.recipes.create.pressing(inter, inter) // ������ ������

//        ,event.recipes.create.filling(inter, [inter, Fluid.of(FluidId, 10)]) //������ ��������
//        ,event.recipes.create.cutting(inter, inter) // ������ ����
    ]).transitionalItem(inter).loops(1)
})