$ ->
  $('#filterforusers').submit ->
    name = $('#name').val()
    department = $('#department option:selected').val()
    position = $('#position').val()
    params = 'name='+name+'&department='+department+'&position='+position
    $.ajax '/users_filter?' + params
    return false

  $('#filterforprices').submit ->
    speciality = $('#speciality_name').val()
    year = $('#year').val()
    form = $('#form').val()
    faculty = $('#faculty').val()
    params = 'speciality_name='+speciality+'&year='+year+'&form='+form+'&faculty='+faculty
    $.ajax '/finance/prices_filter?' + params
    return false
