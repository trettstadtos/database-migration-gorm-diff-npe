package database.migration.gorm.diff.npe

class TestDomain {

  String name

  static constraints = {
    name nullable: false
  }
}
