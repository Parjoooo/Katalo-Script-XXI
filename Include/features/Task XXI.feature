#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@XXI
Feature: Task XXI
    
    
      @UserCanPlayTrailerRandomMovie
  Scenario: User Can Play Trailer Random Movie
  	Given I want to Open Browser XXI
  	When I want to Now Playing Menu
    And I want to Pick Random Movie
    Then I want to See Trailer Movie
    
    
      @UserCanSeeMovieNowPlayingTheaterInTheOtherCity
  Scenario: User Can See Movie Now Playing Theater in The Other City
    When I want to Open Playing In Menu
    And I want to Pick Yogyakarta City
    Then I want to Chose the Theater
    #And I want to Pick Random Movie
    #Then I wan to See Trailer Movie
    
    
      @UserCantOpenPlayingTheater
  Scenario: User Can't Open Playing Theater
    When I want to Open UpComing Menu
    And I want to Pick Random Movie UpComing
    Then I want to Click Playing AT
    
    
    
      @UserCantBuyTicket
  Scenario: User Can't Booking Ticket
    When I want to Open UpComing Menu
    And I want to Pick Random Movie UpComing
    Then I want to Click Buy Ticket
    
    
    
      @UserCanWatchTrailerUpcomingMovie
  Scenario: User Can Watch Trailer Up Coming Movie
    When I want to Open UpComing Menu
    And I want to Pick Random Movie UpComing
    Then I want to See Trailer Movie
    
    


