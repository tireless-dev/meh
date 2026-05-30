// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TableAlias: ImageVector
  get() {
    val current = _tableAlias
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TableAlias",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12 29 H5 a2 2 0 0 1 -2 -2 v-7 a2 2 0 0 1 2 -2 h7 a2 2 0 0 1 2 2 v7 a2 2 0 0 1 -2 2 m-7 -9 v7 h7 v-7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 29
          moveTo(x = 12.0f, y = 29.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m -7 -9
          moveToRelative(dx = -7.0f, dy = -9.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v -7z
          verticalLineToRelative(dy = -7.0f)
          close()
        }
        // M27 3 H5 a2 2 0 0 0 -2 2 v10 h2 v-4 h10 v4 h2 v-4 h10 v7 H17 v2 h10 v7 H17 v2 h10 a2 2 0 0 0 2 -2 V5 a2 2 0 0 0 -2 -2 m0 6 H5 V5 h22Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 3
          moveTo(x = 27.0f, y = 3.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
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
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // V 5
          verticalLineTo(y = 5.0f)
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
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 22z
          horizontalLineToRelative(dx = 22.0f)
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
      .also { _tableAlias = it }
  }

@Suppress("ObjectPropertyName")
private var _tableAlias: ImageVector? = null
