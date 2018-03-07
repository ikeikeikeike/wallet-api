#!/bin/bash

git submodule update --init --remote
pushd slick-table-code-generator
sbt run
popd

cp slick-table-code-generator/output/data/entity/Tables.scala app/data/entity/Table.scala
