// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inspection: ImageVector
  get() {
    val current = _inspection
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Inspection",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="15.0 17.18 12.41 14.59 11.0 16.0 15.0 20.0 22.0 13.0 20.59 11.59 15.0 17.18" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 17.18
          moveTo(x = 15.0f, y = 17.18f)
          // L 12.41 14.59
          lineTo(x = 12.41f, y = 14.59f)
          // L 11 16
          lineTo(x = 11.0f, y = 16.0f)
          // L 15 20
          lineTo(x = 15.0f, y = 20.0f)
          // L 22 13
          lineTo(x = 22.0f, y = 13.0f)
          // L 20.59 11.59
          lineTo(x = 20.59f, y = 11.59f)
          // L 15 17.18z
          lineTo(x = 15.0f, y = 17.18f)
          close()
        }
        // M30 15 h-2.05 A12 12 0 0 0 17 4.05 V2 h-2 v2.05 A12 12 0 0 0 4.05 15 H2 v2 h2.05 A12 12 0 0 0 15 27.95 V30 h2 v-2.05 A12 12 0 0 0 27.95 17 H30Z M17 25.95 V23 h-2 v2.95 A10 10 0 0 1 6.05 17 H9 v-2 H6.05 A10 10 0 0 1 15 6.05 V9 h2 V6.05 A10 10 0 0 1 25.95 15 H23 v2 h2.95 A10 10 0 0 1 17 25.95
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 15
          moveTo(x = 30.0f, y = 15.0f)
          // h -2.05
          horizontalLineToRelative(dx = -2.05f)
          // A 12 12 0 0 0 17 4.05
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 4.05f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.05
          verticalLineToRelative(dy = 2.05f)
          // A 12 12 0 0 0 4.05 15
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.05f,
            y1 = 15.0f,
          )
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.05
          horizontalLineToRelative(dx = 2.05f)
          // A 12 12 0 0 0 15 27.95
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 27.95f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.05
          verticalLineToRelative(dy = -2.05f)
          // A 12 12 0 0 0 27.95 17
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.95f,
            y1 = 17.0f,
          )
          // H 30z
          horizontalLineTo(x = 30.0f)
          close()
          // M 17 25.95
          moveTo(x = 17.0f, y = 25.95f)
          // V 23
          verticalLineTo(y = 23.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.95
          verticalLineToRelative(dy = 2.95f)
          // A 10 10 0 0 1 6.05 17
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 6.05f,
            y1 = 17.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6.05
          horizontalLineTo(x = 6.05f)
          // A 10 10 0 0 1 15 6.05
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 6.05f,
          )
          // V 9
          verticalLineTo(y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6.05
          verticalLineTo(y = 6.05f)
          // A 10 10 0 0 1 25.95 15
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 25.95f,
            y1 = 15.0f,
          )
          // H 23
          horizontalLineTo(x = 23.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.95
          horizontalLineToRelative(dx = 2.95f)
          // A 10 10 0 0 1 17 25.95
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 17.0f,
            y1 = 25.95f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _inspection = it }
  }

@Suppress("ObjectPropertyName")
private var _inspection: ImageVector? = null
