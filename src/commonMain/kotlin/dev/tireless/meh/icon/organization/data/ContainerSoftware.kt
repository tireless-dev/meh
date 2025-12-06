// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ContainerSoftware: ImageVector
  get() {
    val current = _containerSoftware
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ContainerSoftware",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 12 h-8 V4 h8Z m-6 -2 h4 V6 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 12
          moveTo(x = 28.0f, y = 12.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m -6 -2
          moveToRelative(dx = -6.0f, dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M17 15 V9 H9 v14 h14 v-8Z m-6 -4 h4 v4 h-4Z m4 10 h-4 v-4 h4Z m6 0 h-4 v-4 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 15
          moveTo(x = 17.0f, y = 15.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v -8z
          verticalLineToRelative(dy = -8.0f)
          close()
          // m -6 -4
          moveToRelative(dx = -6.0f, dy = -4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m 4 10
          moveToRelative(dx = 4.0f, dy = 10.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 6 0
          moveToRelative(dx = 6.0f, dy = 0.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
        }
        // M26 28 H6 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h10 v2 H6 v20 h20 V16 h2 v10 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 28
          moveTo(x = 26.0f, y = 28.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
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
      .also { _containerSoftware = it }
  }

@Suppress("ObjectPropertyName")
private var _containerSoftware: ImageVector? = null
