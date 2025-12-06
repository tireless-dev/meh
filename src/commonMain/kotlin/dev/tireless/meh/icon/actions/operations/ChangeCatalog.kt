// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChangeCatalog: ImageVector
  get() {
    val current = _changeCatalog
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChangeCatalog",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 24 v2 h2.46 A6 6 0 0 1 22 28 a6 6 0 0 1 -6 -6 h-2 a7.98 7.98 0 0 0 14 5.27 V30 h2 v-6Z m-2 -10 a8 8 0 0 0 -6 2.73 V14 h-2 v6 h6 v-2 h-2.46 A6 6 0 0 1 22 16 a6 6 0 0 1 6 6 h2 a8 8 0 0 0 -8 -8
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 24
          moveTo(x = 24.0f, y = 24.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.46
          horizontalLineToRelative(dx = 2.46f)
          // A 6 6 0 0 1 22 28
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 28.0f,
          )
          // a 6 6 0 0 1 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.0f,
            dy1 = -6.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 7.98 7.98 0 0 0 14 5.27
          arcToRelative(
            a = 7.98f,
            b = 7.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 5.27f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
          // m -2 -10
          moveToRelative(dx = -2.0f, dy = -10.0f)
          // a 8 8 0 0 0 -6 2.73
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 2.73f,
          )
          // V 14
          verticalLineTo(y = 14.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.46
          horizontalLineToRelative(dx = -2.46f)
          // A 6 6 0 0 1 22 16
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 16.0f,
          )
          // a 6 6 0 0 1 6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 8 8 0 0 0 -8 -8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.0f,
            dy1 = -8.0f,
          )
        }
        // M12 28 H6 v-4 h2 v-2 H6 v-5 h2 v-2 H6 v-5 h2 V8 H6 V4 h18 v8 h2 V4 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v4 H2 v2 h2 v5 H2 v2 h2 v5 H2 v2 h2 v4 a2 2 0 0 0 2 2 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 28
          moveTo(x = 12.0f, y = 28.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
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
      .also { _changeCatalog = it }
  }

@Suppress("ObjectPropertyName")
private var _changeCatalog: ImageVector? = null
