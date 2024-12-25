Feature: Swag Labs UI Automation
#    @Feature("Login")
  #    @Severity(SeverityLevel.CRITICAL)
#    @Feature("Login")
  @Epic("LoginEpic")
  Scenario Outline: Swag Labs Login
    Given user launched on Swag Labs
    When user enters "<USERNAME>" and "<PASSWORD>"
    Examples:
      | USERNAME      | PASSWORD     |  |
      | standard_user | secret_sauce |  |
      | standard_user | secret_sauce |  |