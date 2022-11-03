 
listView('1810test43253645645564 Jobs') {
    description('1810test43253645645564 Jobs')
    jobs {
        regex('1810test43253645645564_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
