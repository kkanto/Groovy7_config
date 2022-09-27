 
listView('Groovy7 Jobs') {
    description('Groovy7 Jobs')
    jobs {
        regex('Groovy7_.+')
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
