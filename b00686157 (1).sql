-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 24, 2019 at 12:45 AM
-- Server version: 5.7.23-log
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `b00686157`
--

-- --------------------------------------------------------

--
-- Table structure for table `activity_budget_table`
--

CREATE TABLE `activity_budget_table` (
  `activity_budget_id` int(30) NOT NULL,
  `user_id` int(30) NOT NULL,
  `elephant_id` int(30) NOT NULL,
  `weather_id` int(30) NOT NULL,
  `activity_id` int(30) NOT NULL,
  `species_id` int(30) NOT NULL,
  `part_eaten_id` int(30) NOT NULL,
  `plant_height_id` int(30) NOT NULL,
  `nearest_elephant_id` int(30) NOT NULL,
  `elephant_distance_id` int(30) NOT NULL,
  `mahout_distance_id` int(30) NOT NULL,
  `mahout_command` bit(1) DEFAULT NULL,
  `habitat_id` int(30) NOT NULL,
  `activity_budget_date` date NOT NULL,
  `slope` bit(1) DEFAULT NULL,
  `gps_location` int(30) NOT NULL,
  `observer_date` date NOT NULL,
  `observer_start_time` time NOT NULL,
  `observer_end_time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `activity_budget_table`
--

INSERT INTO `activity_budget_table` (`activity_budget_id`, `user_id`, `elephant_id`, `weather_id`, `activity_id`, `species_id`, `part_eaten_id`, `plant_height_id`, `nearest_elephant_id`, `elephant_distance_id`, `mahout_distance_id`, `mahout_command`, `habitat_id`, `activity_budget_date`, `slope`, `gps_location`, `observer_date`, `observer_start_time`, `observer_end_time`) VALUES
(5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, NULL, 2, '2014-11-12', NULL, 2, '2017-12-11', '00:00:02', '00:00:02'),
(9, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, NULL, 2, '2014-11-12', NULL, 2, '2017-12-11', '00:00:02', '00:00:02'),
(12, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, b'1', 2, '2014-11-12', b'1', 2, '2017-12-11', '00:00:02', '00:00:02'),
(14, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, b'1', 2, '2014-11-12', NULL, 2, '2017-12-11', '00:00:02', '00:00:02');

-- --------------------------------------------------------

--
-- Table structure for table `activity_budget_table_test`
--

CREATE TABLE `activity_budget_table_test` (
  `activity_budget_id` int(8) NOT NULL,
  `activity_id_fk` int(8) NOT NULL,
  `user_id_fk` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `activity_budget_table_test`
--

INSERT INTO `activity_budget_table_test` (`activity_budget_id`, `activity_id_fk`, `user_id_fk`) VALUES
(1, 2, 2),
(3, 2, 2),
(5, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `activity_table`
--

CREATE TABLE `activity_table` (
  `activity_id` int(30) NOT NULL,
  `activity_name` varchar(30) NOT NULL,
  `activity_description` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `activity_table`
--

INSERT INTO `activity_table` (`activity_id`, `activity_name`, `activity_description`) VALUES
(1, 'F', 'Feeding'),
(2, 'FP', 'Feeding Preparation'),
(3, 'CI', 'Conspecific Interaction'),
(4, 'STY', 'Stereotyping'),
(5, 'DU', 'Dusting'),
(6, 'BH', 'Bodyhoarding');

-- --------------------------------------------------------

--
-- Table structure for table `elephant_distance_table`
--

CREATE TABLE `elephant_distance_table` (
  `elephant_distance_id` int(30) NOT NULL,
  `elephant_distance_type` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `elephant_distance_table`
--

INSERT INTO `elephant_distance_table` (`elephant_distance_id`, `elephant_distance_type`) VALUES
(1, '<1m'),
(2, '1-10m'),
(3, '10-20m'),
(4, '>20m');

-- --------------------------------------------------------

--
-- Table structure for table `elephant_table`
--

CREATE TABLE `elephant_table` (
  `elephant_id` int(30) NOT NULL,
  `elephant_name` varchar(30) NOT NULL,
  `gender` varchar(30) NOT NULL,
  `age` int(11) NOT NULL,
  `leaving_captivity_date` date NOT NULL,
  `mahout` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `elephant_table`
--

INSERT INTO `elephant_table` (`elephant_id`, `elephant_name`, `gender`, `age`, `leaving_captivity_date`, `mahout`) VALUES
(1, 'Boulouwan', 'Male', 12, '2014-07-14', 'patiyee'),
(2, 'Kah Moon', 'Female', 68, '2015-05-11', 'Wynn');

-- --------------------------------------------------------

--
-- Table structure for table `habitat_table`
--

CREATE TABLE `habitat_table` (
  `habitat_id` int(30) NOT NULL,
  `habitat_type` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `habitat_table`
--

INSERT INTO `habitat_table` (`habitat_id`, `habitat_type`) VALUES
(1, 'Dry Deciduous'),
(2, 'Evergreen'),
(3, 'Shrub'),
(4, 'Grass');

-- --------------------------------------------------------

--
-- Table structure for table `mahout_distance_table`
--

CREATE TABLE `mahout_distance_table` (
  `mahout_distance_id` int(30) NOT NULL,
  `mahout_distance_type` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `mahout_distance_table`
--

INSERT INTO `mahout_distance_table` (`mahout_distance_id`, `mahout_distance_type`) VALUES
(1, '<1m'),
(2, '1-10m'),
(3, '10-20m'),
(4, '>20m');

-- --------------------------------------------------------

--
-- Table structure for table `new`
--

CREATE TABLE `new` (
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `part_eaten_table`
--

CREATE TABLE `part_eaten_table` (
  `part_eaten_id` int(30) NOT NULL,
  `part_eaten_type` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `part_eaten_table`
--

INSERT INTO `part_eaten_table` (`part_eaten_id`, `part_eaten_type`) VALUES
(1, 'Leaves'),
(2, 'Stem'),
(3, 'Branch'),
(4, 'Fruit');

-- --------------------------------------------------------

--
-- Table structure for table `plant_height_table`
--

CREATE TABLE `plant_height_table` (
  `plant_height_id` int(30) NOT NULL,
  `plant_height_type` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `plant_height_table`
--

INSERT INTO `plant_height_table` (`plant_height_id`, `plant_height_type`) VALUES
(1, 'Mahout Cut'),
(2, '<1m'),
(3, '1-2m'),
(4, '2-4m'),
(5, '>4m');

-- --------------------------------------------------------

--
-- Table structure for table `species_table`
--

CREATE TABLE `species_table` (
  `species_id` int(11) NOT NULL,
  `species_name` varchar(30) NOT NULL,
  `species_description` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `species_table`
--

INSERT INTO `species_table` (`species_id`, `species_name`, `species_description`) VALUES
(1, 'G', 'Grass'),
(2, 'S', 'Shrub'),
(3, 'T', 'Tree'),
(4, 'V', 'Vine'),
(5, 'F', 'Ferns');

-- --------------------------------------------------------

--
-- Table structure for table `test_relationship`
--

CREATE TABLE `test_relationship` (
  `test_relationship_id` int(30) NOT NULL,
  `user_id` int(30) NOT NULL,
  `elephant_id` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `user_table`
--

CREATE TABLE `user_table` (
  `user_id` int(30) NOT NULL,
  `user_fname` varchar(30) NOT NULL,
  `user_sname` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_table`
--

INSERT INTO `user_table` (`user_id`, `user_fname`, `user_sname`, `password`) VALUES
(1, 'Ryan', 'Kennedy', 'Spacet72'),
(2, 'Ali', 'Brady', 'Password1'),
(3, 'Myles', 'Osbourne', 'Chiang');

-- --------------------------------------------------------

--
-- Table structure for table `user_types_all`
--

CREATE TABLE `user_types_all` (
  `user_type_all_id` int(30) NOT NULL,
  `user_type_id` int(30) NOT NULL,
  `user_id` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `user_types_table`
--

CREATE TABLE `user_types_table` (
  `user_type_id` int(11) NOT NULL,
  `user_type_name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_types_table`
--

INSERT INTO `user_types_table` (`user_type_id`, `user_type_name`) VALUES
(1, 'Observer'),
(2, 'Admin'),
(3, 'Staff');

-- --------------------------------------------------------

--
-- Table structure for table `weather_table`
--

CREATE TABLE `weather_table` (
  `weather_id` int(11) NOT NULL,
  `weather_description` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `weather_table`
--

INSERT INTO `weather_table` (`weather_id`, `weather_description`) VALUES
(1, 'Cloudy'),
(2, 'Sunny'),
(3, 'Raining'),
(4, 'Thunderstorms');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `activity_budget_table`
--
ALTER TABLE `activity_budget_table`
  ADD PRIMARY KEY (`activity_budget_id`),
  ADD KEY `activity_id_con` (`activity_id`),
  ADD KEY `elephant_distance_id_con` (`elephant_distance_id`),
  ADD KEY `habitat_id_con` (`habitat_id`),
  ADD KEY `mahout_distance_id_con` (`mahout_distance_id`),
  ADD KEY `nearest_elephant_id_con` (`elephant_id`),
  ADD KEY `part_eaten_id_con` (`part_eaten_id`),
  ADD KEY `plant_height_id_con` (`plant_height_id`),
  ADD KEY `species_id_con` (`species_id`),
  ADD KEY `user_id_con` (`user_id`),
  ADD KEY `weather_id_con` (`weather_id`);

--
-- Indexes for table `activity_budget_table_test`
--
ALTER TABLE `activity_budget_table_test`
  ADD PRIMARY KEY (`activity_budget_id`),
  ADD KEY `activity_id_fk` (`activity_id_fk`),
  ADD KEY `user_id_fk` (`user_id_fk`);

--
-- Indexes for table `activity_table`
--
ALTER TABLE `activity_table`
  ADD PRIMARY KEY (`activity_id`);

--
-- Indexes for table `elephant_distance_table`
--
ALTER TABLE `elephant_distance_table`
  ADD PRIMARY KEY (`elephant_distance_id`);

--
-- Indexes for table `elephant_table`
--
ALTER TABLE `elephant_table`
  ADD PRIMARY KEY (`elephant_id`);

--
-- Indexes for table `habitat_table`
--
ALTER TABLE `habitat_table`
  ADD PRIMARY KEY (`habitat_id`);

--
-- Indexes for table `mahout_distance_table`
--
ALTER TABLE `mahout_distance_table`
  ADD PRIMARY KEY (`mahout_distance_id`);

--
-- Indexes for table `part_eaten_table`
--
ALTER TABLE `part_eaten_table`
  ADD PRIMARY KEY (`part_eaten_id`);

--
-- Indexes for table `plant_height_table`
--
ALTER TABLE `plant_height_table`
  ADD PRIMARY KEY (`plant_height_id`);

--
-- Indexes for table `species_table`
--
ALTER TABLE `species_table`
  ADD PRIMARY KEY (`species_id`);

--
-- Indexes for table `test_relationship`
--
ALTER TABLE `test_relationship`
  ADD PRIMARY KEY (`test_relationship_id`);

--
-- Indexes for table `user_table`
--
ALTER TABLE `user_table`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `user_types_all`
--
ALTER TABLE `user_types_all`
  ADD PRIMARY KEY (`user_type_all_id`),
  ADD KEY `user_type_id` (`user_type_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `user_types_table`
--
ALTER TABLE `user_types_table`
  ADD PRIMARY KEY (`user_type_id`);

--
-- Indexes for table `weather_table`
--
ALTER TABLE `weather_table`
  ADD PRIMARY KEY (`weather_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `activity_budget_table`
--
ALTER TABLE `activity_budget_table`
  MODIFY `activity_budget_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `activity_budget_table_test`
--
ALTER TABLE `activity_budget_table_test`
  MODIFY `activity_budget_id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `activity_table`
--
ALTER TABLE `activity_table`
  MODIFY `activity_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `elephant_distance_table`
--
ALTER TABLE `elephant_distance_table`
  MODIFY `elephant_distance_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `elephant_table`
--
ALTER TABLE `elephant_table`
  MODIFY `elephant_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `habitat_table`
--
ALTER TABLE `habitat_table`
  MODIFY `habitat_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `mahout_distance_table`
--
ALTER TABLE `mahout_distance_table`
  MODIFY `mahout_distance_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `part_eaten_table`
--
ALTER TABLE `part_eaten_table`
  MODIFY `part_eaten_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `plant_height_table`
--
ALTER TABLE `plant_height_table`
  MODIFY `plant_height_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `species_table`
--
ALTER TABLE `species_table`
  MODIFY `species_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `test_relationship`
--
ALTER TABLE `test_relationship`
  MODIFY `test_relationship_id` int(30) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user_table`
--
ALTER TABLE `user_table`
  MODIFY `user_id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user_types_all`
--
ALTER TABLE `user_types_all`
  MODIFY `user_type_all_id` int(30) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user_types_table`
--
ALTER TABLE `user_types_table`
  MODIFY `user_type_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `weather_table`
--
ALTER TABLE `weather_table`
  MODIFY `weather_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `activity_budget_table`
--
ALTER TABLE `activity_budget_table`
  ADD CONSTRAINT `activity_id_con` FOREIGN KEY (`activity_id`) REFERENCES `activity_table` (`activity_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `elephant_distance_id_con` FOREIGN KEY (`elephant_distance_id`) REFERENCES `elephant_distance_table` (`elephant_distance_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `elephant_id_con` FOREIGN KEY (`elephant_id`) REFERENCES `elephant_table` (`elephant_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `habitat_id_con` FOREIGN KEY (`habitat_id`) REFERENCES `habitat_table` (`habitat_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `mahout_distance_id_con` FOREIGN KEY (`mahout_distance_id`) REFERENCES `mahout_distance_table` (`mahout_distance_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `nearest_elephant_id_con` FOREIGN KEY (`elephant_id`) REFERENCES `elephant_table` (`elephant_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `part_eaten_id_con` FOREIGN KEY (`part_eaten_id`) REFERENCES `part_eaten_table` (`part_eaten_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `plant_height_id_con` FOREIGN KEY (`plant_height_id`) REFERENCES `plant_height_table` (`plant_height_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `species_id_con` FOREIGN KEY (`species_id`) REFERENCES `species_table` (`species_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `user_id_con` FOREIGN KEY (`user_id`) REFERENCES `user_table` (`user_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `weather_id_con` FOREIGN KEY (`weather_id`) REFERENCES `weather_table` (`weather_id`) ON UPDATE CASCADE;

--
-- Constraints for table `activity_budget_table_test`
--
ALTER TABLE `activity_budget_table_test`
  ADD CONSTRAINT `activity_id_fk` FOREIGN KEY (`activity_id_fk`) REFERENCES `activity_table` (`activity_id`),
  ADD CONSTRAINT `user_id_fk` FOREIGN KEY (`user_id_fk`) REFERENCES `user_table` (`user_id`);

--
-- Constraints for table `user_types_all`
--
ALTER TABLE `user_types_all`
  ADD CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user_table` (`user_id`),
  ADD CONSTRAINT `user_type_id` FOREIGN KEY (`user_type_id`) REFERENCES `user_types_table` (`user_type_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
