package lesson_2

fun main() {
    val totalEmployeeSalary = 50*30000
    val totalSalaryWithTrainers = (30*20000) + totalEmployeeSalary
    val averageSalary = (totalEmployeeSalary + totalSalaryWithTrainers) / 80

    print("Расходы на выплату зарплаты постоянных сотрудников: $totalEmployeeSalary RUB\n" +
            "Общие расходы по ЗП после прихода стажеров: $totalSalaryWithTrainers RUB\n" +
            "Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary RUB"
    )
}