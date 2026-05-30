// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PDF: ImageVector
  get() {
    val current = _pDF
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PDF",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 11.0 30.0 9.0 22.0 9.0 22.0 23.0 24.0 23.0 24.0 17.0 29.0 17.0 29.0 15.0 24.0 15.0 24.0 11.0 30.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 11
          moveTo(x = 30.0f, y = 11.0f)
          // L 30 9
          lineTo(x = 30.0f, y = 9.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 22 23
          lineTo(x = 22.0f, y = 23.0f)
          // L 24 23
          lineTo(x = 24.0f, y = 23.0f)
          // L 24 17
          lineTo(x = 24.0f, y = 17.0f)
          // L 29 17
          lineTo(x = 29.0f, y = 17.0f)
          // L 29 15
          lineTo(x = 29.0f, y = 15.0f)
          // L 24 15
          lineTo(x = 24.0f, y = 15.0f)
          // L 24 11
          lineTo(x = 24.0f, y = 11.0f)
          // L 30 11z
          lineTo(x = 30.0f, y = 11.0f)
          close()
        }
        // M8 9 H2 v14 h2 v-5 h4 a2 2 0 0 0 2 -2 v-5 a2 2 0 0 0 -2 -2 m0 7 H4 v-5 h4Z m8 7 h-4 V9 h4 a4 4 0 0 1 4 4 v6 a4 4 0 0 1 -4 4 m-2 -2 h2 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 h-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 9
          moveTo(x = 8.0f, y = 9.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m 0 7
          moveToRelative(dx = 0.0f, dy = 7.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 8 7
          moveToRelative(dx = 8.0f, dy = 7.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m -2 -2
          moveToRelative(dx = -2.0f, dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
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
      .also { _pDF = it }
  }

@Suppress("ObjectPropertyName")
private var _pDF: ImageVector? = null
